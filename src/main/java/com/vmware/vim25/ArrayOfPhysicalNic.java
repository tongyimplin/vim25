package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPhysicalNic;
import com.vmware.vim25.PhysicalNic;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNic", propOrder = {"physicalNic"})
public class ArrayOfPhysicalNic {
  @XmlElement(name = "PhysicalNic")
  protected List<PhysicalNic> physicalNic;
  
  public List<PhysicalNic> getPhysicalNic() {
    if (this.physicalNic == null)
      this.physicalNic = new ArrayList<>(); 
    return this.physicalNic;
  }
}
