//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour essence_type_type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="essence_type_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Picture"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="Data"/>
 *     &lt;enumeration value="D10_30"/>
 *     &lt;enumeration value="D10_40"/>
 *     &lt;enumeration value="D10_50"/>
 *     &lt;enumeration value="IEC_DV_25"/>
 *     &lt;enumeration value="DV_Based_DV_25"/>
 *     &lt;enumeration value="DV_50"/>
 *     &lt;enumeration value="DV_100_1080i"/>
 *     &lt;enumeration value="DV_100_720p"/>
 *     &lt;enumeration value="AVCI_200_1080i"/>
 *     &lt;enumeration value="AVCI_200_1080p"/>
 *     &lt;enumeration value="AVCI_200_720p"/>
 *     &lt;enumeration value="AVCI_100_1080i"/>
 *     &lt;enumeration value="AVCI_100_1080p"/>
 *     &lt;enumeration value="AVCI_100_720p"/>
 *     &lt;enumeration value="AVCI_50_1080i"/>
 *     &lt;enumeration value="AVCI_50_1080p"/>
 *     &lt;enumeration value="AVCI_50_720p"/>
 *     &lt;enumeration value="AVC_High_10_Intra_Uncs"/>
 *     &lt;enumeration value="AVC_High_422_Intra_Uncs"/>
 *     &lt;enumeration value="Unc_SD"/>
 *     &lt;enumeration value="Unc_HD_1080i"/>
 *     &lt;enumeration value="Unc_HD_1080p"/>
 *     &lt;enumeration value="Unc_HD_720p"/>
 *     &lt;enumeration value="Unc_UHD_3840"/>
 *     &lt;enumeration value="Avid_10b_Unc_SD"/>
 *     &lt;enumeration value="Avid_10b_Unc_HD_1080i"/>
 *     &lt;enumeration value="Avid_10b_Unc_HD_1080p"/>
 *     &lt;enumeration value="Avid_10b_Unc_HD_720p"/>
 *     &lt;enumeration value="Avid_Unc_Alpha_SD"/>
 *     &lt;enumeration value="Avid_Unc_Alpha_HD_1080i"/>
 *     &lt;enumeration value="Avid_Unc_Alpha_HD_1080p"/>
 *     &lt;enumeration value="Avid_Unc_Alpha_HD_720p"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_422P_HL_1080i"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_422P_HL_1080p"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_422P_HL_720p"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_MP_HL_1920_1080i"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_MP_HL_1920_1080p"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_MP_HL_1440_1080i"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_MP_HL_1440_1080p"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_MP_HL_720p"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_MP_H14_1080i"/>
 *     &lt;enumeration value="MPEG_2_Long_GOP_MP_H14_1080p"/>
 *     &lt;enumeration value="VC3_1080p_1235"/>
 *     &lt;enumeration value="VC3_1080p_1237"/>
 *     &lt;enumeration value="VC3_1080p_1238"/>
 *     &lt;enumeration value="VC3_1080i_1241"/>
 *     &lt;enumeration value="VC3_1080i_1242"/>
 *     &lt;enumeration value="VC3_1080i_1243"/>
 *     &lt;enumeration value="VC3_1080i_1244"/>
 *     &lt;enumeration value="VC3_720p_1250"/>
 *     &lt;enumeration value="VC3_720p_1251"/>
 *     &lt;enumeration value="VC3_720p_1252"/>
 *     &lt;enumeration value="VC3_1080p_1253"/>
 *     &lt;enumeration value="VC3_720p_1258"/>
 *     &lt;enumeration value="VC3_1080p_1259"/>
 *     &lt;enumeration value="VC3_1080i_1260"/>
 *     &lt;enumeration value="MJPEG_2_1"/>
 *     &lt;enumeration value="MJPEG_3_1"/>
 *     &lt;enumeration value="MJPEG_10_1"/>
 *     &lt;enumeration value="MJPEG_20_1"/>
 *     &lt;enumeration value="MJPEG_4_1_M"/>
 *     &lt;enumeration value="MJPEG_10_1_M"/>
 *     &lt;enumeration value="MJPEG_15_1_S"/>
 *     &lt;enumeration value="WAVE_PCM"/>
 *     &lt;enumeration value="D10_AES3_PCM"/>
 *     &lt;enumeration value="ANC_Data"/>
 *     &lt;enumeration value="VBI_Data"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "essence_type_type")
@XmlEnum
public enum EssenceTypeType {
	
	@XmlEnumValue("Unknown") UNKNOWN("Unknown"), @XmlEnumValue("Picture") PICTURE("Picture"), @XmlEnumValue("Sound") SOUND("Sound"), @XmlEnumValue("Data") DATA(
			"Data"), @XmlEnumValue("D10_30") D_10_30("D10_30"), @XmlEnumValue("D10_40") D_10_40("D10_40"), @XmlEnumValue("D10_50") D_10_50(
					"D10_50"), IEC_DV_25("IEC_DV_25"), @XmlEnumValue("DV_Based_DV_25") DV_BASED_DV_25("DV_Based_DV_25"), DV_50("DV_50"), @XmlEnumValue("DV_100_1080i") DV_100_1080_I(
							"DV_100_1080i"), @XmlEnumValue("DV_100_720p") DV_100_720_P("DV_100_720p"), @XmlEnumValue("AVCI_200_1080i") AVCI_200_1080_I(
									"AVCI_200_1080i"), @XmlEnumValue("AVCI_200_1080p") AVCI_200_1080_P("AVCI_200_1080p"), @XmlEnumValue("AVCI_200_720p") AVCI_200_720_P(
											"AVCI_200_720p"), @XmlEnumValue("AVCI_100_1080i") AVCI_100_1080_I("AVCI_100_1080i"), @XmlEnumValue("AVCI_100_1080p") AVCI_100_1080_P(
													"AVCI_100_1080p"), @XmlEnumValue("AVCI_100_720p") AVCI_100_720_P("AVCI_100_720p"), @XmlEnumValue("AVCI_50_1080i") AVCI_50_1080_I(
															"AVCI_50_1080i"), @XmlEnumValue("AVCI_50_1080p") AVCI_50_1080_P("AVCI_50_1080p"), @XmlEnumValue("AVCI_50_720p") AVCI_50_720_P(
																	"AVCI_50_720p"), @XmlEnumValue("AVC_High_10_Intra_Uncs") AVC_HIGH_10_INTRA_UNCS(
																			"AVC_High_10_Intra_Uncs"), @XmlEnumValue("AVC_High_422_Intra_Uncs") AVC_HIGH_422_INTRA_UNCS(
																					"AVC_High_422_Intra_Uncs"), @XmlEnumValue("Unc_SD") UNC_SD("Unc_SD"), @XmlEnumValue("Unc_HD_1080i") UNC_HD_1080_I(
																							"Unc_HD_1080i"), @XmlEnumValue("Unc_HD_1080p") UNC_HD_1080_P(
																									"Unc_HD_1080p"), @XmlEnumValue("Unc_HD_720p") UNC_HD_720_P(
																											"Unc_HD_720p"), @XmlEnumValue("Unc_UHD_3840") UNC_UHD_3840(
																													"Unc_UHD_3840"), @XmlEnumValue("Avid_10b_Unc_SD") AVID_10_B_UNC_SD(
																															"Avid_10b_Unc_SD"), @XmlEnumValue("Avid_10b_Unc_HD_1080i") AVID_10_B_UNC_HD_1080_I(
																																	"Avid_10b_Unc_HD_1080i"), @XmlEnumValue("Avid_10b_Unc_HD_1080p") AVID_10_B_UNC_HD_1080_P(
																																			"Avid_10b_Unc_HD_1080p"), @XmlEnumValue("Avid_10b_Unc_HD_720p") AVID_10_B_UNC_HD_720_P(
																																					"Avid_10b_Unc_HD_720p"), @XmlEnumValue("Avid_Unc_Alpha_SD") AVID_UNC_ALPHA_SD(
																																							"Avid_Unc_Alpha_SD"), @XmlEnumValue("Avid_Unc_Alpha_HD_1080i") AVID_UNC_ALPHA_HD_1080_I(
																																									"Avid_Unc_Alpha_HD_1080i"), @XmlEnumValue("Avid_Unc_Alpha_HD_1080p") AVID_UNC_ALPHA_HD_1080_P(
																																											"Avid_Unc_Alpha_HD_1080p"), @XmlEnumValue("Avid_Unc_Alpha_HD_720p") AVID_UNC_ALPHA_HD_720_P(
																																													"Avid_Unc_Alpha_HD_720p"), @XmlEnumValue("MPEG_2_Long_GOP_422P_HL_1080i") MPEG_2_LONG_GOP_422_P_HL_1080_I(
																																															"MPEG_2_Long_GOP_422P_HL_1080i"), @XmlEnumValue("MPEG_2_Long_GOP_422P_HL_1080p") MPEG_2_LONG_GOP_422_P_HL_1080_P(
																																																	"MPEG_2_Long_GOP_422P_HL_1080p"), @XmlEnumValue("MPEG_2_Long_GOP_422P_HL_720p") MPEG_2_LONG_GOP_422_P_HL_720_P(
																																																			"MPEG_2_Long_GOP_422P_HL_720p"), @XmlEnumValue("MPEG_2_Long_GOP_MP_HL_1920_1080i") MPEG_2_LONG_GOP_MP_HL_1920_1080_I(
																																																					"MPEG_2_Long_GOP_MP_HL_1920_1080i"), @XmlEnumValue("MPEG_2_Long_GOP_MP_HL_1920_1080p") MPEG_2_LONG_GOP_MP_HL_1920_1080_P(
																																																							"MPEG_2_Long_GOP_MP_HL_1920_1080p"), @XmlEnumValue("MPEG_2_Long_GOP_MP_HL_1440_1080i") MPEG_2_LONG_GOP_MP_HL_1440_1080_I(
																																																									"MPEG_2_Long_GOP_MP_HL_1440_1080i"), @XmlEnumValue("MPEG_2_Long_GOP_MP_HL_1440_1080p") MPEG_2_LONG_GOP_MP_HL_1440_1080_P(
																																																											"MPEG_2_Long_GOP_MP_HL_1440_1080p"), @XmlEnumValue("MPEG_2_Long_GOP_MP_HL_720p") MPEG_2_LONG_GOP_MP_HL_720_P(
																																																													"MPEG_2_Long_GOP_MP_HL_720p"), @XmlEnumValue("MPEG_2_Long_GOP_MP_H14_1080i") MPEG_2_LONG_GOP_MP_H_14_1080_I(
																																																															"MPEG_2_Long_GOP_MP_H14_1080i"), @XmlEnumValue("MPEG_2_Long_GOP_MP_H14_1080p") MPEG_2_LONG_GOP_MP_H_14_1080_P(
																																																																	"MPEG_2_Long_GOP_MP_H14_1080p"), @XmlEnumValue("VC3_1080p_1235") VC_3_1080_P_1235(
																																																																			"VC3_1080p_1235"), @XmlEnumValue("VC3_1080p_1237") VC_3_1080_P_1237(
																																																																					"VC3_1080p_1237"), @XmlEnumValue("VC3_1080p_1238") VC_3_1080_P_1238(
																																																																							"VC3_1080p_1238"), @XmlEnumValue("VC3_1080i_1241") VC_3_1080_I_1241(
																																																																									"VC3_1080i_1241"), @XmlEnumValue("VC3_1080i_1242") VC_3_1080_I_1242(
																																																																											"VC3_1080i_1242"), @XmlEnumValue("VC3_1080i_1243") VC_3_1080_I_1243(
																																																																													"VC3_1080i_1243"), @XmlEnumValue("VC3_1080i_1244") VC_3_1080_I_1244(
																																																																															"VC3_1080i_1244"), @XmlEnumValue("VC3_720p_1250") VC_3_720_P_1250(
																																																																																	"VC3_720p_1250"), @XmlEnumValue("VC3_720p_1251") VC_3_720_P_1251(
																																																																																			"VC3_720p_1251"), @XmlEnumValue("VC3_720p_1252") VC_3_720_P_1252(
																																																																																					"VC3_720p_1252"), @XmlEnumValue("VC3_1080p_1253") VC_3_1080_P_1253(
																																																																																							"VC3_1080p_1253"), @XmlEnumValue("VC3_720p_1258") VC_3_720_P_1258(
																																																																																									"VC3_720p_1258"), @XmlEnumValue("VC3_1080p_1259") VC_3_1080_P_1259(
																																																																																											"VC3_1080p_1259"), @XmlEnumValue("VC3_1080i_1260") VC_3_1080_I_1260(
																																																																																													"VC3_1080i_1260"), MJPEG_2_1(
																																																																																															"MJPEG_2_1"), MJPEG_3_1(
																																																																																																	"MJPEG_3_1"), MJPEG_10_1(
																																																																																																			"MJPEG_10_1"), MJPEG_20_1(
																																																																																																					"MJPEG_20_1"), MJPEG_4_1_M(
																																																																																																							"MJPEG_4_1_M"), MJPEG_10_1_M(
																																																																																																									"MJPEG_10_1_M"), MJPEG_15_1_S(
																																																																																																											"MJPEG_15_1_S"), WAVE_PCM(
																																																																																																													"WAVE_PCM"), @XmlEnumValue("D10_AES3_PCM") D_10_AES_3_PCM(
																																																																																																															"D10_AES3_PCM"), @XmlEnumValue("ANC_Data") ANC_DATA(
																																																																																																																	"ANC_Data"), @XmlEnumValue("VBI_Data") VBI_DATA(
																																																																																																																			"VBI_Data");
	private final String value;
	
	EssenceTypeType(String v) {
		value = v;
	}
	
	public String value() {
		return value;
	}
	
	public static EssenceTypeType fromValue(String v) {
		for (EssenceTypeType c : EssenceTypeType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
