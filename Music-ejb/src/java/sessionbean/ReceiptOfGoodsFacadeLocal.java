/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.ReceiptOfGoods;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author zemor
 */
@Local
public interface ReceiptOfGoodsFacadeLocal {

    void create(ReceiptOfGoods receiptOfGoods);

    void edit(ReceiptOfGoods receiptOfGoods);

    void remove(ReceiptOfGoods receiptOfGoods);

    ReceiptOfGoods find(Object id);

    List<ReceiptOfGoods> findAll();

    List<ReceiptOfGoods> findRange(int[] range);

    int count();
    
}
