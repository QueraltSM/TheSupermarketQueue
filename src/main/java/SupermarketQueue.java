public class SupermarketQueue {
    public static int getTotalTimeRequired(int[] peopleQueueTime, int n){
        int time = 0;
        if (n==1) {
            for (int peopleTime : peopleQueueTime) time += peopleTime;
            return time;
        }
        return caseN2(peopleQueueTime);
    }

    public static int caseN2(int[] peopleQueueTime){
        int time1 = peopleQueueTime[0];
        int time2 =  peopleQueueTime[1];
        int box1 = peopleQueueTime[0];
        int box2 = peopleQueueTime[1];
        for (int i = 1; i<peopleQueueTime.length-1; i++)
            if (box1 > box2) {
                box1 -= box2;
                box2 = peopleQueueTime[i + 1];
                time2 += box2;
            } else {
                box2 -= box1;
                box1 = peopleQueueTime[i + 1];
                time1 += box1;
            }
        return time1 > time2 ? time1 : time2;
    }
}