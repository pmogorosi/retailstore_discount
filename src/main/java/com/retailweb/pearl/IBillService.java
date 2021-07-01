package com.retailweb.pearl;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IBillService {

    List<Bill> getBills();

    List<BillNetPayment> getBillsNetPay();
    
}
