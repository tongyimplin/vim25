package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EvaluationLicenseSource;
import com.vmware.vim25.LicenseServerSource;
import com.vmware.vim25.LocalLicenseSource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseSource")
@XmlSeeAlso({EvaluationLicenseSource.class, LicenseServerSource.class, LocalLicenseSource.class})
public class LicenseSource extends DynamicData {}
