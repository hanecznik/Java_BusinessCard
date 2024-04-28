import java.util.ArrayList;

public class BusinessCard implements Cards {
    private static final String default_tel = "Nie podano";
    private static final String default_city = "Nie podano";
    private static final char frame_char = '*';

    private String name;
    private String surname;
    private String tel;
    private String city;


    public BusinessCard(String name, String surname) {
        this(name, surname, default_tel, default_city);
    }
    public BusinessCard(String name, String surname, String tel, String city) {
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getBorder() {
        return '*';
    }

        public void print() {
            ArrayList<String> lines = getLines();

            int maxLength = getMaxLength(lines);
            char border = getBorder();

            String starsLine = "";
            for (int i = 0; i < maxLength + 2; i++) {
                starsLine += border;
            }

            System.out.println(starsLine);

            for (String line : lines) {
                int lengthDiff = maxLength - line.length();

                for (int i = 0; i < lengthDiff; i++) {
                    line += " ";
                }

                line = border + line + border;

                System.out.println(line);
            }

            System.out.println(starsLine);
        }

        private int getMaxLength (ArrayList < String > lines) {
            int maxLength = 0;

            for (String line : lines) {
                int lineLength = line.length();

                if (lineLength > maxLength) {
                    maxLength = lineLength;
                }
            }

            return maxLength;
        }


        protected ArrayList<String> getLines () {
            ArrayList<String> lines = new ArrayList<>();

            lines.add(name + " " + surname);
            lines.add("tel. " + tel + " adres: " + city);

            return lines;
        }
    }
