package ss16_io_text_file.bai_tap.doc_file_csv;

public class Nation {
    private int id;
    private String code;
    private String nation;

    public Nation(int id, String code, String nation) {
        this.id = id;
        this.code = code;
        this.nation = nation;
    }

    public Nation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
