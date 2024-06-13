package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineDisplayTopology;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDisplayTopology", propOrder = {"x", "y", "width", "height"})
public class VirtualMachineDisplayTopology extends DynamicData {
  protected int x;
  
  protected int y;
  
  protected int width;
  
  protected int height;
  
  public int getX() {
    return this.x;
  }
  
  public void setX(int paramInt) {
    this.x = paramInt;
  }
  
  public int getY() {
    return this.y;
  }
  
  public void setY(int paramInt) {
    this.y = paramInt;
  }
  
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
