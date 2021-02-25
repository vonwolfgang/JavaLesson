public class Main {

    public static void main(String[] args) {

        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new TeacherCreditManager(), new AgricultureCreditManager(), new StudentsCreditManager()};

        for(BaseCreditManager baseCreditManager : baseCreditManagers){
            System.out.println(baseCreditManager.calculation(1000));

        }




    }
}
