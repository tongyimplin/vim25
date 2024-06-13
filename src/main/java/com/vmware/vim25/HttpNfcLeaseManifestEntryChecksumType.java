package com.vmware.vim25;

import com.vmware.vim25.HttpNfcLeaseManifestEntryChecksumType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HttpNfcLeaseManifestEntryChecksumType")
@XmlEnum
public enum HttpNfcLeaseManifestEntryChecksumType {
  SHA_1("sha1"),
  SHA_256("sha256");
  
  private final String value;
  
  HttpNfcLeaseManifestEntryChecksumType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HttpNfcLeaseManifestEntryChecksumType fromValue(String paramString) {
    for (HttpNfcLeaseManifestEntryChecksumType httpNfcLeaseManifestEntryChecksumType : values()) {
      if (httpNfcLeaseManifestEntryChecksumType.value.equals(paramString))
        return httpNfcLeaseManifestEntryChecksumType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
