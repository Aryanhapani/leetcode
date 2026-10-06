class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

       Queue<Integer> std = new LinkedList<>();
        Queue<Integer> sand = new LinkedList<>();

        for(int i=0;i<students.length;i++){
            std.add(students[i]);
            sand.add(sandwiches[i]);
        }

        int count=0;

        while(!std.isEmpty() && !sand.isEmpty()){
            int studentsize=std.size();

            if(std.peek()==sand.peek()){
                count=0;
                std.poll();
                sand.poll();
            }else{
                std.add(std.poll());
                count++;
            }

            if(count==studentsize){
                break;
            }
        }

        return std.size();
    }
}