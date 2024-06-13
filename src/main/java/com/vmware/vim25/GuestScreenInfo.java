package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestScreenInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestScreenInfo", propOrder = {"width", "height"})
public class GuestScreenInfo extends DynamicData {
  protected int width;
  
  protected int height;
  
  public int getWidth() {
    return this.width;
  }
  
  public void setWidth(int paramInt) {
    this.width = paramInt;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public void setHeight(int paramInt) {
    this.height = paramInt;
  }
}
