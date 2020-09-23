package english_dictionary;

public class English_dictionary {
    
    /**
     * Ham test ket qua.
     * @param args tra ve ket qua.
     */
    
    public static void main(String[] args) {
        DictionaryCommandline dictionary_cmd = new DictionaryCommandline();    
        dictionary_cmd.dictionaryAdvanced();
        dictionary_cmd.dictionarySearcher();
        dictionary_cmd.addNewWord();
        dictionary_cmd.deleteWord(); 
        dictionary_cmd.showAllWords();
        dictionary_cmd.dictionaryExportToFile(); 
    } 
}