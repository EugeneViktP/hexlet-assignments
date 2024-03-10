package exercise;

//import javax.swing.text.html.HTML;

// BEGIN
public class LabelTag implements TagInterface {
    private String type;
    private TagInterface inputTag;

    public LabelTag(String type, TagInterface inputTag) {
        this.inputTag = inputTag;
        this.type = type;
    }
    @Override
    public String render() {
        return "<label>" + type + inputTag.render() + "</label>";
    }

}
// END
