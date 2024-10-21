package facade;

import service.*;

public class ShoppingFacade {
  private UserService userService;
  private VendorService vendorService;
  private PaymentService paymentService;
  private InvoiceService invoiceService;

  public ShoppingFacade() {
    userService = new UserService();
    vendorService = new VendorService();
    paymentService = new PaymentService();
    invoiceService = new InvoiceService();
  }

  public void shopping() {
    userService.getClass();
    vendorService.getVendoerDetails();
    vendorService.sendUserDetails();
    paymentService.makePayment(100);
    invoiceService.generateInvoice();
    System.out.println("Shopping Done");
  }

}