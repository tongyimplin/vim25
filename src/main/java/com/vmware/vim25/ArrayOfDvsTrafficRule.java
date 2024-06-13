package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsTrafficRule;
import com.vmware.vim25.DvsTrafficRule;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsTrafficRule", propOrder = {"dvsTrafficRule"})
public class ArrayOfDvsTrafficRule {
  @XmlElement(name = "DvsTrafficRule")
  protected List<DvsTrafficRule> dvsTrafficRule;
  
  public List<DvsTrafficRule> getDvsTrafficRule() {
    if (this.dvsTrafficRule == null)
      this.dvsTrafficRule = new ArrayList<>(); 
    return this.dvsTrafficRule;
  }
}
