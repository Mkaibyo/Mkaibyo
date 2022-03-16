import java.util.Arrays;

import components.map.Map;
import components.map.Map1L;
import components.queue.Queue;
import components.queue.Queue1L;
import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.set.Set1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Sarah Huetter
 *
 */
public final class Glossary {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Glossary() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static Queue<String> getTerms(SimpleReader file,
            Map<String, String> TaD) {
        //make sequence with all terms will order later
        Sequence<String> terms = new Sequence1L();
        Queue<String> termsordered = new Queue1L();
        //get term
        int count = 0;
        while (!file.atEOS()) {
            String term = file.nextLine();
            terms.add(count, term);
            count++;

            //get def
            StringBuffer space = new StringBuffer();
            String def = "";
            String tmpdef = file.nextLine();
            while (!tmpdef.equals("")) {
                if (tmpdef.contains(" ")) {
                    space.append(tmpdef + " ");
                }
                if (file.atEOS()) {
                    tmpdef = " ";
                } else {
                    tmpdef = file.nextLine();
                }
            }
            def = space.toString();
            TaD.add(term, def);

        }
        order(terms);
        for (int i = 0; i < terms.length(); i++) {
            termsordered.enqueue(terms.entry(i));
        }
        return termsordered;
    }

    public static void order(Sequence<String> ordered) {
        Sequence<String> tmp = new Sequence1L<String>();
        tmp.transferFrom(ordered);
        String next = "";
        int i = 0;
        while (tmp.length() != 0) {
            int count = 0;
            int k = 0;
            while (count < tmp.length() - 1) {
                next = tmp.entry(k);
                if (next.compareTo(tmp.entry(count + 1)) > 0) {
                    k = count + 1;
                }
                count++;
            }
            ordered.add(i, tmp.entry(k));
            tmp.remove(k);
            i++;
        }

    }

    private static String nextwordorsep(String line, int position,
            Set1L<Character> sep) {
        StringBuilder text = new StringBuilder();
        if (sep.contains(line.charAt(position))) {
            for (int i = position; i < line.length()
                    && sep.contains(line.charAt(i)); i++) {
                text.append(line.charAt(i));
            }
        } else {
            for (int i = position; i < line.length()
                    && !sep.contains(line.charAt(i)); i++) {
                text.append(line.charAt(i));
            }
        }
        String completedef = text.toString();
        return completedef;
    }

    public static String links(Queue<String> terms, String def) {
        String definition = "";
        String tmp = "";
        String[] split = def.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (String term : terms) {
                if (split[i].equals(term)) {
                    tmp = "<a href=" + term + ".html>" + term + "</a>";
                    split[i] = tmp;
                } else if (split[i].equals(term + ",")) {
                    tmp = "<a href=" + term + ".html>" + term + "</a>";
                    split[i] = tmp;
                }
            }
        }
        if (tmp.isEmpty()) {
            definition = def;

        } else {
            for (int i = 0; i < split[i].length(); i++) {
                for (int j = 0; j < split[i].length(); j++) {
                    if (split[i].charAt(j) == ',') {
                        split[i] = split[i].replace(',', '*');
                    }
                }
            }
            definition = Arrays.toString(split);
            definition = definition.replaceAll(",", " ");
            definition = definition.replace("[", " ");
            definition = definition.replace("]", " ");

            for (int i = 0; i < definition.length(); i++) {
                if (definition.charAt(i) == '*') {
                    definition = definition.replace('*', ',');
                }
            }
        }
        return definition;
    }

    public static void Wordpage(SimpleWriter file, String term, String def) {
        file.println("<html>");
        file.println("<head>");
        file.println("<title>" + term + "</title>");
        file.println("</head>");
        file.println("<body>");
        file.println("<h2><b><i><font color=\"red\">" + term);
        file.println("</font></i></b></h2>");
        file.println("<blockquote>" + def + "</blockquote>");
        file.println("<hr>");
        file.println("<p>" + "Return to " + "<a href=\"index.html\">index</a>");
        file.println(".");
        file.println("</p>");
        file.println("</body>");
        file.println("</html>");
    }

    public static void list(SimpleWriter index, Queue<String> terms) {
        int count = 0;
        index.println("<ul>");
        while (count < terms.length()) {
            index.println("<li>");
            index.print("<a href=\"" + terms.front() + ".html\">"
                    + terms.front() + "</a>");
            index.print("</li>");
            terms.rotate(1);
            count++;
        }
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        //input and output file
        out.println("Enter filename for terms");
        String inputfile = in.nextLine();
        out.println("enter output foldername");
        String outputname = in.nextLine();
        SimpleReader input = new SimpleReader1L(inputfile);
        SimpleWriter index = new SimpleWriter1L(outputname + "/index.html");
        // terms
        Map<String, String> TandD = new Map1L<>();
        Queue<String> terms = getTerms(input, TandD);
        //make the html title page
        index.println("<html>");
        index.println("<head>");
        index.println("<title>" + "Glossary" + "</title>");
        index.println("</head>");
        index.println("<body>");
        index.println("<h2>" + "Glossary" + "</h2>");
        index.println("<hr />");
        index.println("<h3>" + "Index" + "</h3>");
//wordpages
        int count = 0;
        while (count < terms.length()) {
            String tmpword = terms.front();
            String tmpdef = links(terms, TandD.value(tmpword));
            SimpleWriter tempout = new SimpleWriter1L(
                    outputname + "/" + tmpword + ".html");
            Wordpage(tempout, tmpword, tmpdef);
            terms.rotate(1);
            count++;
        }
        list(index, terms);

        index.println("</ul>" + " </body>" + "</html>");
        in.close();
        out.close();
        index.close();
        input.close();
    }
}
