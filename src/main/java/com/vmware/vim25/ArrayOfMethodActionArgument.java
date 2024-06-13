package com.vmware.vim25;

import com.vmware.vim25.ArrayOfMethodActionArgument;
import com.vmware.vim25.MethodActionArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMethodActionArgument", propOrder = {"methodActionArgument"})
public class ArrayOfMethodActionArgument {
  @XmlElement(name = "MethodActionArgument")
  protected List<MethodActionArgument> methodActionArgument;
  
  public List<MethodActionArgument> getMethodActionArgument() {
    if (this.methodActionArgument == null)
      this.methodActionArgument = new ArrayList<>(); 
    return this.methodActionArgument;
  }
}
