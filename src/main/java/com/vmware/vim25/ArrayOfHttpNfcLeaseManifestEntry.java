package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHttpNfcLeaseManifestEntry;
import com.vmware.vim25.HttpNfcLeaseManifestEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHttpNfcLeaseManifestEntry", propOrder = {"httpNfcLeaseManifestEntry"})
public class ArrayOfHttpNfcLeaseManifestEntry {
  @XmlElement(name = "HttpNfcLeaseManifestEntry")
  protected List<HttpNfcLeaseManifestEntry> httpNfcLeaseManifestEntry;
  
  public List<HttpNfcLeaseManifestEntry> getHttpNfcLeaseManifestEntry() {
    if (this.httpNfcLeaseManifestEntry == null)
      this.httpNfcLeaseManifestEntry = new ArrayList<>(); 
    return this.httpNfcLeaseManifestEntry;
  }
}
