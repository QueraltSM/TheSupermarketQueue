import org.junit.Test;

public class SupermarketQueue_ {

    @Test
    public void total_time_required_when_n_is_1_should_return_sum_of_people_time(){
        assert(SupermarketQueue.getTotalTimeRequired(new int[]{5, 3, 4},1)==12);
    }

    @Test
    public void total_time_required_when_n_is_2_should_return_the_person_with_most_time(){
        assert(SupermarketQueue.getTotalTimeRequired(new int[]{10, 2, 3, 3},2)==10);
    }

    @Test
    public void total_time_required_when_n_is_2_and_people_time_is_2_3_10_should_return_12(){
        assert(SupermarketQueue.getTotalTimeRequired(new int[]{2, 3, 10},2)==12);
    }
}