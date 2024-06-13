package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNicOrderPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNicOrderPolicy", propOrder = {"activeNic", "standbyNic"})
public class HostNicOrderPolicy extends DynamicData {
  protected List<String> activeNic;
  
  protected List<String> standbyNic;
  
  public List<String> getActiveNic() {
    if (this.activeNic == null)
      this.activeNic = new ArrayList<>(); 
    return this.activeNic;
  }
  
  public List<String> getStandbyNic() {
    if (this.standbyNic == null)
      this.standbyNic = new ArrayList<>(); 
    return this.standbyNic;
  }
}
