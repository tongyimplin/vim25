package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMessage", propOrder = {"id", "argument", "text"})
public class VirtualMachineMessage extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected List<Object> argument;
  
  protected String text;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public List<Object> getArgument() {
    if (this.argument == null)
      this.argument = new ArrayList(); 
    return this.argument;
  }
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String paramString) {
    this.text = paramString;
  }
}
