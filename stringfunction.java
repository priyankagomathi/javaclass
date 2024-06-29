public class stringfunction {
    public static void main(String[]args)
    {
        String str="Hello, world:";
        System.out.println("1.length of the string:"+str.length());
        System.out.println("2.character at index 4:"+str.charAt(4));
        System.out.println("3.substring from index 7:"+str.substring(7));
        System.out.println("4.substring from index 1to6:"+str.substring(1,6));
        System.out.println("5.concatenated string:"+str.concat("Good bye:"));
        System.out.println("6.uppercase:"+str.toUpperCase());
        System.out.println("7.lowercase:"+str.toUpperCase());
        System.out.println("8.index of'o':"+str.indexOf('o'));
        System.out.println("9.last index of 'o':"+str.lastIndexOf('o'));
        System.out.println("10.starts with 'He':"+str.startsWith("He"));
        System.out.println("11.ends with 'ld':"+str.endsWith("ld!"));
        System.out.println("12.replace 'o' with 'x':"+str.replace('o','x'));

        String strwithspaces= "  spaces before and after  ";
        System.out.println("13.trimmed string:"+strwithspaces.trim());

        String[] splitArray=str.split( ";" );
        System.out.println("14.split string:");
        for(String s:splitArray)
        {
            System.out.println("\t"+s);
        }
        String str2="Hello, world:";
        System.out.println("15.equality check with 'Hello, world':"+str.equals(str2));
        System.out.println("16.equality check(ignore case)with 'Hello, WORLD:':"+str.equalsIgnoreCase("Hello, WORLD:"));
        String str3="ABC";
        String str4="DEF";
        System.out.println("17.comparison with 'DEF':"+str3.compareTo(str4));
        System.out.println("18.comparison(ignore case) with 'DEF':"+str3.compareToIgnoreCase("DEF"));
        System.out.println("19.contains 'world':"+str.contains("world"));
        System.out.println("20.is the string empty:"+str.isEmpty());

        char[] charArray=str.toCharArray();
        System.out.println("21.char Array:");
        for(char c:charArray) {
            System.out.println(c + " ");
        }
        System.out.println();
        int num=12345;
        String numstr=String.valueOf(num);
        System.out.println("22.String value of integer:"+numstr);
        byte[] byteArray=str.getBytes();
        for(byte b:byteArray) {
            System.out.println(b + " ");
        }
        System.out.println();

        String str5=new String("Hello, world:");
        String str6=str5.intern();
        System.out.println("24.interned string:"+(str==str6));

        String[]words={"Hello", "world","!"};
        String joinedString=String.join(" ",words);
        System.out.println("25.joined string:"+joinedString);
        System.out.println("26.Repeated String:"+"Java".repeat(3));

        String strwithwhitespace="Hello, world:";
        System.out.println("27.stripped String:"+strwithwhitespace.strip());

        String MultilineString="Line 1\nLine 2\nLine 3";
        System.out.println("28.Lines");
        MultilineString.lines().forEach(System.out::println);

        String formattedString=String.format("Name :%s,Age%d","John",30);
        System.out.println("29.formatted String:"+formattedString);

        String Stringwithnumbers="12345";
        System.out.println("30.Replaced String:"+Stringwithnumbers.replaceAll("\\d","x"));
    }
}
