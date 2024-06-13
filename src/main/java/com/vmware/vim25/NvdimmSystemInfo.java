package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmDimmInfo;
import com.vmware.vim25.NvdimmGuid;
import com.vmware.vim25.NvdimmInterleaveSetInfo;
import com.vmware.vim25.NvdimmNamespaceDetails;
import com.vmware.vim25.NvdimmNamespaceInfo;
import com.vmware.vim25.NvdimmSummary;
import com.vmware.vim25.NvdimmSystemInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmSystemInfo", propOrder = {"summary", "dimms", "dimmInfo", "interleaveSet", "iSetInfo", "namespace", "nsInfo", "nsDetails"})
public class NvdimmSystemInfo extends DynamicData {
  protected NvdimmSummary summary;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> dimms;
  
  protected List<NvdimmDimmInfo> dimmInfo;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> interleaveSet;
  
  protected List<NvdimmInterleaveSetInfo> iSetInfo;
  
  protected List<NvdimmGuid> namespace;
  
  protected List<NvdimmNamespaceInfo> nsInfo;
  
  protected List<NvdimmNamespaceDetails> nsDetails;
  
  public NvdimmSummary getSummary() {
    return this.summary;
  }
  
  public void setSummary(NvdimmSummary paramNvdimmSummary) {
    this.summary = paramNvdimmSummary;
  }
  
  public List<Integer> getDimms() {
    if (this.dimms == null)
      this.dimms = new ArrayList<>(); 
    return this.dimms;
  }
  
  public List<NvdimmDimmInfo> getDimmInfo() {
    if (this.dimmInfo == null)
      this.dimmInfo = new ArrayList<>(); 
    return this.dimmInfo;
  }
  
  public List<Integer> getInterleaveSet() {
    if (this.interleaveSet == null)
      this.interleaveSet = new ArrayList<>(); 
    return this.interleaveSet;
  }
  
  public List<NvdimmInterleaveSetInfo> getISetInfo() {
    if (this.iSetInfo == null)
      this.iSetInfo = new ArrayList<>(); 
    return this.iSetInfo;
  }
  
  public List<NvdimmGuid> getNamespace() {
    if (this.namespace == null)
      this.namespace = new ArrayList<>(); 
    return this.namespace;
  }
  
  public List<NvdimmNamespaceInfo> getNsInfo() {
    if (this.nsInfo == null)
      this.nsInfo = new ArrayList<>(); 
    return this.nsInfo;
  }
  
  public List<NvdimmNamespaceDetails> getNsDetails() {
    if (this.nsDetails == null)
      this.nsDetails = new ArrayList<>(); 
    return this.nsDetails;
  }
}
