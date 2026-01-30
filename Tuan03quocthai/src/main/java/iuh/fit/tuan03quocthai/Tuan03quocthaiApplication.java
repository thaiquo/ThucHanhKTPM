package iuh.fit.tuan03quocthai;

import iuh.fit.tuan03quocthai.adapter.JsonService;
import iuh.fit.tuan03quocthai.adapter.XmlSystem;
import iuh.fit.tuan03quocthai.adapter.XmlToJsonAdapter;
import iuh.fit.tuan03quocthai.composite.FileLeaf;
import iuh.fit.tuan03quocthai.composite.FolderComposite;
import iuh.fit.tuan03quocthai.observer.Investor;
import iuh.fit.tuan03quocthai.observer.Stock;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tuan03quocthaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tuan03quocthaiApplication.class, args);

        // TEST COMPOSITE
//        FolderComposite root = new FolderComposite("Root");
//        root.add(new FileLeaf("a.txt"));
//        root.showInfo();
    }

    // 👇 OBSERVER CHẠY Ở ĐÂY
//    @Bean
//    CommandLineRunner runObserverDemo() {
//        return args -> {
//            System.out.println("=== OBSERVER DEMO START ===");
//
//            Stock stock = new Stock();
//
//            Investor alice = new Investor("Alice");
//            Investor bob = new Investor("Bob");
//
//            stock.attach(alice);
//            stock.attach(bob);
//
//            stock.setPrice(120.5);
//            stock.setPrice(135.0);
//
//            System.out.println("=== OBSERVER DEMO END ===");
//        };
//    }

    // 👇 MAIN LOGIC CHẠY ADAPTER Ở ĐÂY
    @Bean
    CommandLineRunner runAdapterDemo() {
        return args -> {
            System.out.println("=== ADAPTER DEMO START ===");

            XmlSystem xmlSystem = new XmlSystem();
            JsonService jsonService = new XmlToJsonAdapter(xmlSystem);

            System.out.println("JSON Output:");
            System.out.println(jsonService.getJsonData());

            System.out.println("=== ADAPTER DEMO END ===");
        };
    }
}
