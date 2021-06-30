package com.retailweb.pearl;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class BillService implements IBillService {


@Override
public List<Bill> getBills(){

ArrayList<Bill> bills = new ArrayList<>();

bills.add(new Bill(100,new int[]{201, 206, 200, 204}, 5000));
bills.add(new Bill(101,new int[]{201, 203, 200, 205, 206}, 5001));
bills.add(new Bill(102,new int[]{202, 206, 200, 204}, 5002));
bills.add(new Bill(103,new int[]{203, 206, 201, 204, 200}, 5003));
bills.add(new Bill(104,new int[]{201, 206, 200, 204}, 5004));

return bills;
}

    
}
