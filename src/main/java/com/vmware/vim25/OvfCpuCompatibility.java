package com.vmware.vim25;

import com.vmware.vim25.OvfCpuCompatibility;
import com.vmware.vim25.OvfImport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfCpuCompatibility", propOrder = {"registerName", "level", "registerValue", "desiredRegisterValue"})
public class OvfCpuCompatibility extends OvfImport {
  @XmlElement(required = true)
  protected String registerName;
  
  protected int level;
  
  @XmlElement(required = true)
  protected String registerValue;
  
  @XmlElement(required = true)
  protected String desiredRegisterValue;
  
  public String getRegisterName() {
    return this.registerName;
  }
  
  public void setRegisterName(String paramString) {
    this.registerName = paramString;
  }
  
  public int getLevel() {
    return this.level;
  }
  
  public void setLevel(int paramInt) {
    this.level = paramInt;
  }
  
  public String getRegisterValue() {
    return this.registerValue;
  }
  
  public void setRegisterValue(String paramString) {
    this.registerValue = paramString;
  }
  
  public String getDesiredRegisterValue() {
    return this.desiredRegisterValue;
  }
  
  public void setDesiredRegisterValue(String paramString) {
    this.desiredRegisterValue = paramString;
  }
}
