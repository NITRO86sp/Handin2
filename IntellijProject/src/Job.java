public class Job {
    int start = 0;
    int end = 0;
    int id = 0;
    int resource = -1;
    public Job(int s, int e, int i){
        start = s;
        end = e;
        id = i;
    }
    public void setResource(int r){
        resource = r;
    }
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }
    public int getId() { return id; }
    public int getResource(){
        return resource;
    }
}
