package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDatastoreBrowserSearchResults;
import com.vmware.vim25.HostDatastoreBrowserSearchResults;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDatastoreBrowserSearchResults", propOrder = {"hostDatastoreBrowserSearchResults"})
public class ArrayOfHostDatastoreBrowserSearchResults {
  @XmlElement(name = "HostDatastoreBrowserSearchResults")
  protected List<HostDatastoreBrowserSearchResults> hostDatastoreBrowserSearchResults;
  
  public List<HostDatastoreBrowserSearchResults> getHostDatastoreBrowserSearchResults() {
    if (this.hostDatastoreBrowserSearchResults == null)
      this.hostDatastoreBrowserSearchResults = new ArrayList<>(); 
    return this.hostDatastoreBrowserSearchResults;
  }
}
