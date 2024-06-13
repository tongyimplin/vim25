package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProfileManagerCompositionValidationResultResultElement;
import com.vmware.vim25.HostProfileManagerCompositionValidationResultResultElement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProfileManagerCompositionValidationResultResultElement", propOrder = {"hostProfileManagerCompositionValidationResultResultElement"})
public class ArrayOfHostProfileManagerCompositionValidationResultResultElement {
  @XmlElement(name = "HostProfileManagerCompositionValidationResultResultElement")
  protected List<HostProfileManagerCompositionValidationResultResultElement> hostProfileManagerCompositionValidationResultResultElement;
  
  public List<HostProfileManagerCompositionValidationResultResultElement> getHostProfileManagerCompositionValidationResultResultElement() {
    if (this.hostProfileManagerCompositionValidationResultResultElement == null)
      this.hostProfileManagerCompositionValidationResultResultElement = new ArrayList<>(); 
    return this.hostProfileManagerCompositionValidationResultResultElement;
  }
}
