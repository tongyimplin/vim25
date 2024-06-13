package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVsanInternalSystemCmmdsQuery;
import com.vmware.vim25.HostVsanInternalSystemCmmdsQuery;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVsanInternalSystemCmmdsQuery", propOrder = {"hostVsanInternalSystemCmmdsQuery"})
public class ArrayOfHostVsanInternalSystemCmmdsQuery {
  @XmlElement(name = "HostVsanInternalSystemCmmdsQuery")
  protected List<HostVsanInternalSystemCmmdsQuery> hostVsanInternalSystemCmmdsQuery;
  
  public List<HostVsanInternalSystemCmmdsQuery> getHostVsanInternalSystemCmmdsQuery() {
    if (this.hostVsanInternalSystemCmmdsQuery == null)
      this.hostVsanInternalSystemCmmdsQuery = new ArrayList<>(); 
    return this.hostVsanInternalSystemCmmdsQuery;
  }
}
