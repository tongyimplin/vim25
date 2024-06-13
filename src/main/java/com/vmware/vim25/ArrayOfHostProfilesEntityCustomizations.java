package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProfilesEntityCustomizations;
import com.vmware.vim25.HostProfilesEntityCustomizations;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProfilesEntityCustomizations", propOrder = {"hostProfilesEntityCustomizations"})
public class ArrayOfHostProfilesEntityCustomizations {
  @XmlElement(name = "HostProfilesEntityCustomizations")
  protected List<HostProfilesEntityCustomizations> hostProfilesEntityCustomizations;
  
  public List<HostProfilesEntityCustomizations> getHostProfilesEntityCustomizations() {
    if (this.hostProfilesEntityCustomizations == null)
      this.hostProfilesEntityCustomizations = new ArrayList<>(); 
    return this.hostProfilesEntityCustomizations;
  }
}
