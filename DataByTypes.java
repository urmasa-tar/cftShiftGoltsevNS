public class DataByTypes {

    

    public DataByTypes(){
        // Listes for int, float, str
        // also thier number for queue
    }

    public void AddLine(String line){
        boolean[] check = TypeStatus(line);
        if(check[2]){ // only string

        }else if(check[0]){// then it's float

        }else{ // otherwise it's integer
            
        }
    }

    private boolean[] TypeStatus(String line){
        //                  [.]  [0 - 9] [a - z]
        boolean[] status = {false, false, false};



        return status;
    }
}
