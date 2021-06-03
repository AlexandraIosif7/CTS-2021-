package teste;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.categorii.PromovabilitateCategory;
import teste.categorii.TesteUrgenteCategory;

//atentie sa nu lasam Suite
@RunWith(Categories.class)
@Suite.SuiteClasses(TesteGrupaMock.class)
@Categories.IncludeCategory(PromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgenteCategory.class)
public class TestSuiteCustom {
}
