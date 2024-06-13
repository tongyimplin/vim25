package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProductComponentInfo;
import com.vmware.vim25.ProductComponentInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductComponentInfo", propOrder = {"productComponentInfo"})
public class ArrayOfProductComponentInfo {
  @XmlElement(name = "ProductComponentInfo")
  protected List<ProductComponentInfo> productComponentInfo;
  
  public List<ProductComponentInfo> getProductComponentInfo() {
    if (this.productComponentInfo == null)
      this.productComponentInfo = new ArrayList<>(); 
    return this.productComponentInfo;
  }
}
