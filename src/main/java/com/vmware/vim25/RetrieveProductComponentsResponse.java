package com.vmware.vim25;

import com.vmware.vim25.ProductComponentInfo;
import com.vmware.vim25.RetrieveProductComponentsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveProductComponentsResponse")
public class RetrieveProductComponentsResponse {
  protected List<ProductComponentInfo> returnval;
  
  public List<ProductComponentInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
