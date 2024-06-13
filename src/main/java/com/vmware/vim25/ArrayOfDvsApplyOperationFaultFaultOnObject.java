package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsApplyOperationFaultFaultOnObject;
import com.vmware.vim25.DvsApplyOperationFaultFaultOnObject;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsApplyOperationFaultFaultOnObject", propOrder = {"dvsApplyOperationFaultFaultOnObject"})
public class ArrayOfDvsApplyOperationFaultFaultOnObject {
  @XmlElement(name = "DvsApplyOperationFaultFaultOnObject")
  protected List<DvsApplyOperationFaultFaultOnObject> dvsApplyOperationFaultFaultOnObject;
  
  public List<DvsApplyOperationFaultFaultOnObject> getDvsApplyOperationFaultFaultOnObject() {
    if (this.dvsApplyOperationFaultFaultOnObject == null)
      this.dvsApplyOperationFaultFaultOnObject = new ArrayList<>(); 
    return this.dvsApplyOperationFaultFaultOnObject;
  }
}
