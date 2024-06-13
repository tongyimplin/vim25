package com.vmware.vim25;

import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.RetrievePropertiesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrievePropertiesResponse")
public class RetrievePropertiesResponse {
  protected List<ObjectContent> returnval;
  
  public List<ObjectContent> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
