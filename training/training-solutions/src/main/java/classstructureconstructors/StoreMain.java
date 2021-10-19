package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store gpustore = new Store("gpu");
        gpustore.store(100);

        Store cpustore = new Store("cpu");
        cpustore.store(100);

        gpustore.store(34);
        gpustore.dispatch(127);
        cpustore.store(63);
        cpustore.dispatch(83);

        System.out.println(gpustore.getProduct() + " " + gpustore.getStock() + " " + "in stock.");
        System.out.println(cpustore.getProduct() + " " + cpustore.getStock() + " " + "in stock." );

    }
}
