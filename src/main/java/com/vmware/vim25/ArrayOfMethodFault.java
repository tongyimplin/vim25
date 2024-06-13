package com.vmware.vim25;

import com.vmware.vim25.ArrayOfMethodFault;
import com.vmware.vim25.MethodFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMethodFault", propOrder = {"methodFault"})
public class ArrayOfMethodFault {
  @XmlElement(name = "MethodFault")
  protected List<MethodFault> methodFault;
  
  public List<MethodFault> getMethodFault() {
    if (this.methodFault == null)
      this.methodFault = new ArrayList<>(); 
    return this.methodFault;
  }
}
