package com.vmware.vim25;

import com.vmware.vim25.InventoryHasStandardAloneHosts;
import com.vmware.vim25.NotEnoughLicenses;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryHasStandardAloneHosts", propOrder = {"hosts"})
public class InventoryHasStandardAloneHosts extends NotEnoughLicenses {
  @XmlElement(required = true)
  protected List<String> hosts;
  
  public List<String> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
}
