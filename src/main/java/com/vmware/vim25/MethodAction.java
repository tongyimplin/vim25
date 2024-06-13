package com.vmware.vim25;

import com.vmware.vim25.Action;
import com.vmware.vim25.MethodAction;
import com.vmware.vim25.MethodActionArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodAction", propOrder = {"name", "argument"})
public class MethodAction extends Action {
  @XmlElement(required = true)
  protected String name;
  
  protected List<MethodActionArgument> argument;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public List<MethodActionArgument> getArgument() {
    if (this.argument == null)
      this.argument = new ArrayList<>(); 
    return this.argument;
  }
}
