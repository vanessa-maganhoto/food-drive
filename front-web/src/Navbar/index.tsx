import './styles.css'
import { ReactComponent as Logo } from './logo.svg'

export default function Navbar() {
    return (
        <nav className="main-navbar">
            <Logo />
            <a href="home" className="logo-text">Food Drive</a>
        </nav>
    )
}