package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.UsbScanCodeSpecModifierType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsbScanCodeSpecModifierType", propOrder = {"leftControl", "leftShift", "leftAlt", "leftGui", "rightControl", "rightShift", "rightAlt", "rightGui"})
public class UsbScanCodeSpecModifierType extends DynamicData {
  protected Boolean leftControl;
  
  protected Boolean leftShift;
  
  protected Boolean leftAlt;
  
  protected Boolean leftGui;
  
  protected Boolean rightControl;
  
  protected Boolean rightShift;
  
  protected Boolean rightAlt;
  
  protected Boolean rightGui;
  
  public Boolean isLeftControl() {
    return this.leftControl;
  }
  
  public void setLeftControl(Boolean paramBoolean) {
    this.leftControl = paramBoolean;
  }
  
  public Boolean isLeftShift() {
    return this.leftShift;
  }
  
  public void setLeftShift(Boolean paramBoolean) {
    this.leftShift = paramBoolean;
  }
  
  public Boolean isLeftAlt() {
    return this.leftAlt;
  }
  
  public void setLeftAlt(Boolean paramBoolean) {
    this.leftAlt = paramBoolean;
  }
  
  public Boolean isLeftGui() {
    return this.leftGui;
  }
  
  public void setLeftGui(Boolean paramBoolean) {
    this.leftGui = paramBoolean;
  }
  
  public Boolean isRightControl() {
    return this.rightControl;
  }
  
  public void setRightControl(Boolean paramBoolean) {
    this.rightControl = paramBoolean;
  }
  
  public Boolean isRightShift() {
    return this.rightShift;
  }
  
  public void setRightShift(Boolean paramBoolean) {
    this.rightShift = paramBoolean;
  }
  
  public Boolean isRightAlt() {
    return this.rightAlt;
  }
  
  public void setRightAlt(Boolean paramBoolean) {
    this.rightAlt = paramBoolean;
  }
  
  public Boolean isRightGui() {
    return this.rightGui;
  }
  
  public void setRightGui(Boolean paramBoolean) {
    this.rightGui = paramBoolean;
  }
}
