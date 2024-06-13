package com.vmware.vim25;

import com.vmware.vim25.DvsApplyOperationFault;
import com.vmware.vim25.DvsApplyOperationFaultFaultOnObject;
import com.vmware.vim25.DvsFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsApplyOperationFault", propOrder = {"objectFault"})
public class DvsApplyOperationFault extends DvsFault {
  @XmlElement(required = true)
  protected List<DvsApplyOperationFaultFaultOnObject> objectFault;
  
  public List<DvsApplyOperationFaultFaultOnObject> getObjectFault() {
    if (this.objectFault == null)
      this.objectFault = new ArrayList<>(); 
    return this.objectFault;
  }
}
