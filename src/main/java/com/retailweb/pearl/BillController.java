package com.retailweb.pearl;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class BillController {

	public static void main(String[] args) {
        System.out.println("This is test");
        new BillController().getBill();
	}


@Autowired
private IBillService  billService;

@GetMapping(value = "/bill")
public List<Bill> getBill() {

    //get all products on the bill
List<Bill> billProducts = billService.getBills();
 System.out.println(billProducts);
return billProducts;
}

}
