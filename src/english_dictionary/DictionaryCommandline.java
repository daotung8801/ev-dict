package english_dictionary;

public class DictionaryCommandline extends DictionaryManagement {
    
    /** hàm override lại phương thức của lớp DictionaryManagement
     * hiển thị kết quả danh sách dữ liệu từ điển
     */  
    @Override
    
    public void showAllWords() {
        super.showAllWords();
    }
    
    public void dictionaryBasic() {
        super.insertFromCommandline();
        showAllWords();
    }
    
    public void dictionaryAdvanced() {
        super.insertFromFile();
        super.showAllWords();
        super.dictionaryLookup();
    }
}
