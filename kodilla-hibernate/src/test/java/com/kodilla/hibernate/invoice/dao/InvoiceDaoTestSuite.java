package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    public InvoiceDao invoiceDao;
    @Autowired
    public ItemDao itemDao;
    @Autowired
    public ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new Product("Pen"), new BigDecimal("1"), 5, new BigDecimal("4"));
        Item item2 = new Item(new Product("Notebook"), new BigDecimal("3"), 10, new BigDecimal("5"));
        Item item3 = new Item(new Product("Pencil"), new BigDecimal("2"), 2, new BigDecimal("6"));

        Invoice invoice = new Invoice("1/9/18");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        productDao.save(item1.getProduct());
        productDao.save(item2.getProduct());
        productDao.save(item3.getProduct());
        invoiceDao.save(invoice);
        int idInvoice = invoice.getId();
        int idProduct1 = item1.getProduct().getId();
        int idProduct2 = item2.getProduct().getId();
        int idProduct3 = item3.getProduct().getId();

        //Then
        Assert.assertNotEquals(0, idInvoice);

        //CleanUp
        invoiceDao.delete(idInvoice);
        productDao.delete(idProduct1);
        productDao.delete(idProduct2);
        productDao.delete(idProduct3);
    }
}
