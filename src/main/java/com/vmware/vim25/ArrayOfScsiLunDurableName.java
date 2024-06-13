package com.vmware.vim25;

import com.vmware.vim25.ArrayOfScsiLunDurableName;
import com.vmware.vim25.ScsiLunDurableName;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScsiLunDurableName", propOrder = {"scsiLunDurableName"})
public class ArrayOfScsiLunDurableName {
  @XmlElement(name = "ScsiLunDurableName")
  protected List<ScsiLunDurableName> scsiLunDurableName;
  
  public List<ScsiLunDurableName> getScsiLunDurableName() {
    if (this.scsiLunDurableName == null)
      this.scsiLunDurableName = new ArrayList<>(); 
    return this.scsiLunDurableName;
  }
}
