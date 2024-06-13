package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProfileManagerCompositionResultResultElement;
import com.vmware.vim25.HostProfileManagerCompositionResultResultElement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProfileManagerCompositionResultResultElement", propOrder = {"hostProfileManagerCompositionResultResultElement"})
public class ArrayOfHostProfileManagerCompositionResultResultElement {
  @XmlElement(name = "HostProfileManagerCompositionResultResultElement")
  protected List<HostProfileManagerCompositionResultResultElement> hostProfileManagerCompositionResultResultElement;
  
  public List<HostProfileManagerCompositionResultResultElement> getHostProfileManagerCompositionResultResultElement() {
    if (this.hostProfileManagerCompositionResultResultElement == null)
      this.hostProfileManagerCompositionResultResultElement = new ArrayList<>(); 
    return this.hostProfileManagerCompositionResultResultElement;
  }
}
