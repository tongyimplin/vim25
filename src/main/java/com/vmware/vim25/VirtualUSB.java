package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualUSB;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualUSB", propOrder = {"connected", "vendor", "product", "family", "speed"})
public class VirtualUSB extends VirtualDevice {
  protected boolean connected;
  
  protected Integer vendor;
  
  protected Integer product;
  
  protected List<String> family;
  
  protected List<String> speed;
  
  public boolean isConnected() {
    return this.connected;
  }
  
  public void setConnected(boolean paramBoolean) {
    this.connected = paramBoolean;
  }
  
  public Integer getVendor() {
    return this.vendor;
  }
  
  public void setVendor(Integer paramInteger) {
    this.vendor = paramInteger;
  }
  
  public Integer getProduct() {
    return this.product;
  }
  
  public void setProduct(Integer paramInteger) {
    this.product = paramInteger;
  }
  
  public List<String> getFamily() {
    if (this.family == null)
      this.family = new ArrayList<>(); 
    return this.family;
  }
  
  public List<String> getSpeed() {
    if (this.speed == null)
      this.speed = new ArrayList<>(); 
    return this.speed;
  }
}
