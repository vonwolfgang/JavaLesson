public class Main {

    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.Calculate();

        CreditUI creditUI = new CreditUI();
        // CreditUI sınıfından bir obje oluşturduk
        creditUI.CreditCalculate(new SoldierCreditManager());
        creditUI.CreditCalculate(new TeacherCreditManager());
        creditUI.CreditCalculate(new AgricultureCreditManager());
        // bu objenin sahip olduğu metodu çağırdık ama parametre olarak BaseCreditManager sınıfından bir obje alması gerekiyor.
        // BaseCreditManager ise 3 ayrı sınıfın annesi olduğu için bu üç sınıftan herhangi birisini vererek çalıştırabiliriz.
        // buna polymorhpism denir.

    }
}
