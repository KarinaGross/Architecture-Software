public class Person {
    private int id;
    private String FIO;
    private Long cardNumber;
    private Long hashPass;
    private String login;

    public int getId() {
        return this.id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getHashPass() {
        return this.hashPass;
    }

    public void setHashPass(Long hashPass) {
        this.hashPass = hashPass;
    }
}
